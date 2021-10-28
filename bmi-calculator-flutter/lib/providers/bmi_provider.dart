import 'package:bmi_calculator/input_page.dart';
import 'package:flutter/cupertino.dart';

class BMIProvider extends ChangeNotifier {
  int age = 10;
  Gender gender;
  int height = 180;
  int weight = 50;

  calculateBMI() {
    
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
