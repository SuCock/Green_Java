import React from "react";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import "./App.css";
import { CheckoutPage } from "./Checkout.jsx";
import { SuccessPage } from "./Success.jsx";
import { FailPage } from "./Fail.jsx";

const router = createBrowserRouter([
  {
    // 결제요청 페이지
    path: "/",
    element: <CheckoutPage />,
  },
  {
    // 결제성공 페이지
    path: "success",
    element: <SuccessPage />,
  },
  {
    // 결제실패 페이지
    path: "fail",
    element: <FailPage />,
  },
]);

export function App() {
  return <RouterProvider router={router} />;
}
