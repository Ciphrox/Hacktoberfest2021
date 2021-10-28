import 'dart:math';
import 'package:bmi_calculator/utils/constants.dart';
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
      return 'You\'re having a higher body weight than normal. Try to exercise more.';
    } else if (_bmi >= 18.5) {
      return 'You\'re having a normal body weight. Good Job!';
    } else {
      return 'You have a lower body weight than normal. You can eat a bit more!';
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
