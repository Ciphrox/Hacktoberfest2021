import 'package:bmi_calculator/input_page.dart';
import 'package:flutter/cupertino.dart';

class BMIProvider extends ChangeNotifier {
  int _age;
  Gender _gender;

  get age => _age;
  get gender => _gender;

  updateAge(int val) {
    _age = val;
    notifyListeners();
  }

  updateGender(Gender gen) {
    _gender = gen;
    notifyListeners();
  }
}
