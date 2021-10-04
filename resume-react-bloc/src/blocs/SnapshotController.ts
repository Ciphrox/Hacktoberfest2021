export class SnapshotController<T> {
  private _data?: T;
  private _error: any;
  private _hasData: boolean;
  private _hasError: boolean;
  constructor(data?: T, error?: any) {
    this._data = data;
    this._error = error;
    this._hasData = data ? true : false;
    this._hasError = error ? true : false;
  }

  get data() {
    return this._data;
  }

  get error() {
    return this._error;
  }

  get hasData() {
    return this._hasData;
  }

  get hasError() {
    return this._hasError;
  }
}
