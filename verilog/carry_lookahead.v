module cla(a, b, cin, out);
parameter N = 16;
input [N-1:0] a,b;
input cin;
output [N:0] out;
wire [N:0] carry;

assign carry[0] = cin;

genvar k;
generate for (k = 0;k<N;k=k+1) begin
fullAdder fa(a[k], b[k], carry[k], out[k], carry[k+1]);
end
endgenerate

assign out[N] = carry[N];
endmodule
