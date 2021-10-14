import 'package:http/http.dart' as http;
import 'dart:convert';

class NetworkHelper {
  NetworkHelper(this.url);
  final String url;

  Future getData() async {
    http.Response response = await http.get(url);
    if (response.statusCode == 200) {
      String data = response.body; // Extract the data in form of string
      return jsonDecode(data); // Return the decoded json data
    } else
      print(response.statusCode);
  }
}
