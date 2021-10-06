import { Component } from "react";
import { BehaviorSubject, Subject } from "rxjs";
import { SnapshotController } from "../blocs/SnapshotController";

export class StreamBuilder<T> extends Component<
  {
    initialData?: T;
    stream: Subject<T>;
    builder: (snapshot: SnapshotController<T | undefined>) => JSX.Element;
  },
  { snapshot: SnapshotController<T | undefined> }
> {
  constructor(props: {
    initialData?: T;
    stream: BehaviorSubject<T>;
    builder: (snapshot: SnapshotController<T | undefined>) => JSX.Element;
  }) {
    super(props);
    const { initialData } = props;

    this.state = {
      snapshot: new SnapshotController(initialData),
    };
  }
  componentDidMount() {
    if (!this.props.stream.closed) {
      this.props.stream.subscribe({
        next: (data) => {
          console.log(data);

          this.setState({
            snapshot: new SnapshotController(data),
          });
        },
        error: (data) => {
          console.log("@Error");
          this.setState({
            snapshot: new SnapshotController(undefined, data),
          });
        },
      });
    }
  }
  render() {
    return this.props.builder(this.state.snapshot);
  }
}
