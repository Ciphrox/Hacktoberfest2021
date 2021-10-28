import 'package:bmi_calculator/providers/bmi_provider.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'input_page.dart';

void main() => runApp(BMICalculator());

class BMICalculator extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MultiProvider(
      providers: [
        ChangeNotifierProvider(
          create: (_) => BMIProvider(),
        )
      ],
      child: MaterialApp(
        debugShowCheckedModeBanner: false,
        home: InputPage(),
        theme: ThemeData.dark().copyWith(
          scaffoldBackgroundColor: Color(0xFF0b1034),
          primaryColor: Color(0xFF0b1034),
        ),
      ),
    );
  }
}
