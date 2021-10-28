import 'package:flutter/material.dart';

class ReusableContainer extends StatelessWidget {
  ReusableContainer({@required this.colr, this.cardChild, this.onPress});

  final Color colr;
  final Widget cardChild;
  final Function onPress;

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onPress,
      child: Container(
        child: cardChild,
        margin: EdgeInsets.all(12),
        decoration: BoxDecoration(
          color: colr,
          borderRadius: BorderRadius.circular(15),
        ),
      ),
    );
  }
}
