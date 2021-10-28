import 'package:flutter/material.dart';
import '../utils/text_styles.dart';

class IconContent extends StatelessWidget {
  final IconData icon;
  final String text;

  IconContent({@required this.icon, @required this.text});

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Icon(
          icon,
          size: 100,
        ),
        SizedBox(
          height: 20,
        ),
        Text(
          text,
          style: kLabelTextStyle,
        ),
      ],
    );
  }
}
