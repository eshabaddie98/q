{-
   Blockchain.com Exchange REST API
   ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. \\ These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account \\ Select API from the drop down menu \\ Fill out form and click “Create New API Key Now” \\ Once generated you can view your keys under API Settings. \\ Please be aware that the API key can only be used once it was verified via email.  The API key must be set via the \\ `X-API-Token`\\ header.  The base URL to be used for all calls is \\ `https://api.blockchain.com/v3/exchange`  Autogenerated clients for this API can be found [here](https://github.com/blockchain/lib-exchange-client). 

   The version of the OpenAPI document: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.OrderStatus exposing (OrderStatus(..), decoder, encode, toString)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type OrderStatus
    = OPEN
    | REJECTED
    | CANCELED
    | FILLED
    | PARTFILLED
    | EXPIRED



decoder : Decoder OrderStatus
decoder =
    Decode.string
        |> Decode.andThen
            (\str ->
                case str of
                    "OPEN" ->
                        Decode.succeed OPEN

                    "REJECTED" ->
                        Decode.succeed REJECTED

                    "CANCELED" ->
                        Decode.succeed CANCELED

                    "FILLED" ->
                        Decode.succeed FILLED

                    "PART_FILLED" ->
                        Decode.succeed PARTFILLED

                    "EXPIRED" ->
                        Decode.succeed EXPIRED

                    other ->
                        Decode.fail <| "Unknown type: " ++ other
            )



encode : OrderStatus -> Encode.Value
encode model =
    case model of
        OPEN ->
            Encode.string "OPEN"

        REJECTED ->
            Encode.string "REJECTED"

        CANCELED ->
            Encode.string "CANCELED"

        FILLED ->
            Encode.string "FILLED"

        PARTFILLED ->
            Encode.string "PART_FILLED"

        EXPIRED ->
            Encode.string "EXPIRED"




toString : OrderStatus -> String
toString model =
    case model of
        OPEN ->
            "OPEN"

        REJECTED ->
            "REJECTED"

        CANCELED ->
            "CANCELED"

        FILLED ->
            "FILLED"

        PARTFILLED ->
            "PART_FILLED"

        EXPIRED ->
            "EXPIRED"



