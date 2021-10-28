import 'dart:math';
import 'package:bmi_calculator/utils/colors.dart';
import 'package:bmi_calculator/utils/strings.dart';
import 'package:flutter/material.dart';

class Calculator {
  final int height;
  final int weight;
  double _bmi;
  Calculator(this.height, this.weight);

  String calculateBMI() {
    _bmi = weight / pow(height / 100, 2);
    return _bmi.toStringAsFixed(1);
  }

  String getResult() {
    if (_bmi >= 25)
      return 'OVERWEIGHT';
    else if (_bmi >= 18.5)
      return 'NORMAL';
    else
      return 'UNDERWEIGHT';
  }

  String getMessage() {
    if (_bmi >= 25) {
      return HIGHER_BODY_WEIGHT;
    } else if (_bmi >= 18.5) {
      return NORMAL_BODY_WEIGHT;
    } else {
      return LOWER_BODY_WEIGHT;
    }
  }

  Color getColor() {
    if (_bmi >= 25)
      return kOverWeight;
    else if (_bmi >= 18.5)
      return kNormal;
    else
      return kUnderWeight;
  }
}
