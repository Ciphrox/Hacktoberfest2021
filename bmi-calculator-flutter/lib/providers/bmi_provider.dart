import 'package:bmi_calculator/CalculateBMI.dart';
import 'package:bmi_calculator/input_page.dart';
import 'package:flutter/cupertino.dart';

class BMIProvider extends ChangeNotifier {
  int age = 10;
  Gender gender;
  int height = 180;
  int weight = 50;
  String bmi;
  String title;
  String message;
  Color color;
  String advice;

  calculateBMI() {
    Calculator calc = Calculator(height, weight);
    bmi = calc.calculateBMI();
    title = calc.getResult();
    advice = calc.getMessage();
    color = calc.getColor();
    notifyListeners();
  }

  updateAge(int val) {
    age = val;
    notifyListeners();
  }

  updateGender(Gender gen) {
    gender = gen;
    notifyListeners();
  }

  updateHeight(int val) {
    height = val;
    notifyListeners();
  }

  updateWeight(int val) {
    weight = val;
    notifyListeners();
  }
}
