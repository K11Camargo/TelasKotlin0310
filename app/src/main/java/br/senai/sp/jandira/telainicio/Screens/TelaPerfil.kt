package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telainicio.R

@Composable
fun TelaPerfil() {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(modifier = Modifier.width(80.dp)) {}

            Text(
                modifier = Modifier
                    .padding(top = 10.dp),
                text = "Perfil",
                fontSize = 20.sp
            )
            Row(
                modifier = Modifier
                    .width(80.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    modifier = Modifier
                        .padding(10.dp)
                        .size(32.dp),
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Configuração",
                    tint = Color.Black
                )
            }
        }

        Column(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxHeight()
                .width(370.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 45.dp)
                    .background(
                        color = Color(0xFFFEE101),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .height(190.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .offset(y = -40.dp)
                        .zIndex(1f)
                        .size(140.dp),
                    painter = painterResource(id = R.drawable.silviasantos),
                    contentDescription = "Foto de Perfil"
                )

                Column(
                    modifier = Modifier
                        .offset(y = -30.dp)
                        .fillMaxWidth()
                        .height(120.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .height(30.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Silvia Santos",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Row(
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Entrou em 2021",
                            fontSize = 20.sp
                        )
                    }
                }
            }

            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )

            Column(
                modifier = Modifier
                    .height(170.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(120.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 10.dp)
                        ) {
                            Text(
                                text = "Estudando",
                                fontSize = 20.sp
                            )
                            Text(
                                text = "Historia",
                                fontSize = 15.sp
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .width(120.dp)
                            .height(60.dp)
                    )

                    Box(
                        modifier = Modifier
                            .width(130.dp)
                            .height(60.dp)
                    ) {
                        Text(
                            text = "Aluno/Mentor",
                            fontSize = 20.sp
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(170.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 10.dp)
                        ) {
                            Text(
                                text = "Série",
                                fontSize = 20.sp
                            )
                            Text(
                                text = "3º - fundamental 1",
                                fontSize = 15.sp
                            )
                        }
                    }

                    Button(
                        modifier = Modifier
                            .padding(start = 30.dp)
                            .offset(y = -10.dp)
                            .height(50.dp)
                            .width(150.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFEE101)),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "Ver grupo de mentoria",
                            color = Color.Black,
                            fontSize = 13.sp
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(210.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 10.dp)
                        ) {
                            Text(
                                text = "Assunto no momento",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                            Text(
                                text = "Segunda Guerra Mundial",
                                fontSize = 15.sp
                            )
                        }
                    }
                }
            }

            Spacer(
                modifier = Modifier
                    .height(40.dp)
            )

            Column(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Desempenho",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
                Column(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .height(150.dp)
                        .fillMaxWidth()
                        .border(2.dp, Color(0xFFD9D9D9), RoundedCornerShape(8.dp))
                        .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp)
                            .border(2.dp, Color(0xFFD9D9D9), RoundedCornerShape(topStart = 8.dp))

                    ) {
                        Box(
                            modifier = Modifier
                                .height(70.dp)
                                .width(190.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(top = 3.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .align(Alignment.CenterHorizontally)
                                            .padding(top = 5.dp)
                                            .size(25.dp),
                                        painter = painterResource(id = R.drawable.medalhadeouro),
                                        contentDescription = "Medalha de ouro do rank"
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .width(140.dp)
                                        .height(60.dp)
                                ) {
                                    Text(
                                        modifier = Modifier
                                            .padding(top = 5.dp),
                                        fontSize = 18.sp,
                                        text = "Rank recorde"
                                    )
                                    Text(text = "Ouro ||")
                                }
                            }
                        }

                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(190.dp)
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFFD9D9D9),
                                    shape = RoundedCornerShape(topEnd = 8.dp)
                                )
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(top = 3.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(50.dp)
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .align(Alignment.CenterHorizontally)
                                            .padding(top = 5.dp)
                                            .size(25.dp),
                                        painter = painterResource(id = R.drawable.pontos),
                                        contentDescription = "Pontos do perfil"
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .width(140.dp)
                                        .height(60.dp)
                                ) {
                                    Text(
                                        modifier = Modifier
                                            .padding(top = 5.dp),
                                        fontSize = 18.sp,
                                        text = "Pontos"
                                    )
                                    Text(text = "210")
                                }
                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()

                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(192.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxHeight()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .width(50.dp)
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .align(Alignment.CenterHorizontally)
                                            .padding(top = 10.dp)
                                            .size(25.dp),
                                        painter = painterResource(id = R.drawable.calendario),
                                        contentDescription = "Sem parar"
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .padding(top = 6.dp)
                                        .width(140.dp)
                                        .fillMaxHeight()
                                ) {
                                    Text(
                                        modifier = Modifier
                                            .padding(top = 5.dp),
                                        fontSize = 18.sp,
                                        text = "Sem parar!"
                                    )
                                    Text(text = "14 dias")
                                }
                                Box(modifier = Modifier
                                    .fillMaxHeight()
                                    .background(Color(0xFFD9D9D9))
                                    .width(2.dp))

                            }
                        }

                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .width(190.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .padding(top = 6.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(50.dp)
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .align(Alignment.CenterHorizontally)
                                            .padding(top = 5.dp)
                                            .size(25.dp),
                                        painter = painterResource(id = R.drawable.correto),
                                        contentDescription = "Atividades feitas"
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .width(140.dp)
                                        .height(40.dp)
                                ) {
                                    Text(
                                        modifier = Modifier
                                            .padding(top = 5.dp),
                                        fontSize = 17.sp,
                                        text = "Atividades feitas"
                                    )
                                    Text(text = "20")
                                }
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(60.dp))



            Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(280.dp)
                    .width(350.dp),

                ) {
                Row (modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Rank - Alunos",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp)
                }
                Row (modifier = Modifier
                    .padding(top = 5.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
                ) {

                    Column (modifier = Modifier
                        .fillMaxHeight()
                        .width(120.dp)
                    ) {
                        Image(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(100.dp),
                            painter = painterResource(id = R.drawable.rankbronzedois),
                            contentDescription = "Medalha de bronze"
                        )

                        Text(modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                            text = "Bronze ||",
                            fontSize = 20.sp,
                            color = Color(0xffA96224),
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Column (modifier = Modifier
                        .height(165.dp)
                        .width(200.dp)

                    ) {
                        Box(
                            modifier = Modifier
                                .height(165.dp)
                                .width(200.dp)
                                .border(2.dp, Color(0xFFD9D9D9))
                        ) {
                            Column {
                                Row(
                                    modifier = Modifier
                                        .height(55.dp)
                                        .width(800.dp)
                                ) {

                                    Column {
                                        Row(
                                            modifier = Modifier
                                                .height(55.dp)
                                                .fillMaxWidth()
                                        ) {
                                            Box(
                                                modifier = Modifier
                                                    .height(55.dp)
                                                    .width(35.dp)
                                            ) {

                                                //POSICAO VINDO DO BANCO
                                                Text(
                                                    modifier = Modifier
                                                        .align(Alignment.Center),
                                                    text = "#9",
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 18.sp
                                                )
                                            }


                                            //FOTO VINDO DO BANCO
                                            Image(
                                                modifier = Modifier
                                                    .padding(top = 5.dp)
                                                    .size(45.dp),
                                                painter = painterResource(id = R.drawable.grande),
                                                contentDescription = "Foto de Perfil1"
                                            )

                                            Column (modifier = Modifier
                                                .fillMaxHeight()
                                                .width(80.dp)
                                            ) {
                                                //NOME VINDO DO BANCO
                                                Text(
                                                    modifier = Modifier.padding(top = 20.dp),
                                                    text = "grande eweww...",
                                                    fontSize = 10.sp
                                                )

                                            }


                                            //PONTOS VINDO DO BANCO
                                            Text(
                                                modifier = Modifier
                                                    .padding(top = 20.dp)
                                                    .height(12.dp)
                                                    .width(37.dp),
                                                text = "271PTS",
                                                fontSize = 10.sp
                                            )
                                        }

                                    }


                                }
                                Row(
                                    modifier = Modifier
                                        .height(55.dp)
                                        .width(800.dp)
                                        .background(Color(0xFFD9D9D9))
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .height(55.dp)
                                            .fillMaxWidth()
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .height(60.dp)
                                                .width(35.dp)
                                        ) {

                                            //POSICAO VINDO DO BANCO
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.Center),
                                                text = "#10",
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 18.sp
                                            )
                                        }


                                        //FOTO VINDO DO BANCO
                                        Image(
                                            modifier = Modifier
                                                .padding(top = 5.dp)
                                                .size(45.dp),
                                            painter = painterResource(id = R.drawable.silviasantos),
                                            contentDescription = "Foto de Perfil"
                                        )


                                        Column (modifier = Modifier
                                            .fillMaxHeight()
                                            .width(80.dp)
                                        ) {
                                            //NOME VINDO DO BANCO
                                            Text(
                                                modifier = Modifier.padding(top = 20.dp),
                                                text = "Silvia Santos",
                                                fontSize = 10.sp
                                            )

                                        }



                                        //PONTOS VINDO DO BANCO
                                        Text(
                                            modifier = Modifier
                                                .padding(top = 20.dp)
                                                .height(12.dp)
                                                .width(37.dp),
                                            text = "219PTS",
                                            fontSize = 10.sp
                                        )
                                    }


                                }
                                Row(
                                    modifier = Modifier
                                        .height(55.dp)
                                        .width(800.dp)
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .height(55.dp)
                                            .fillMaxWidth()
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .height(55.dp)
                                                .width(35.dp)
                                        ) {

                                            //POSICAO VINDO DO BANCO
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.Center),
                                                text = "#11",
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 18.sp
                                            )
                                        }


                                        //FOTO VINDO DO BANCO
                                        Image(
                                            modifier = Modifier
                                                .padding(top = 5.dp)
                                                .size(45.dp),
                                            painter = painterResource(id = R.drawable.tom),
                                            contentDescription = "Foto de Perfil"
                                        )


                                        Column(modifier = Modifier
                                            .fillMaxHeight()
                                            .width(80.dp)
                                        ) {
                                            //NOME VINDO DO BANCO
                                            Text(
                                                modifier = Modifier.padding(top = 20.dp),
                                                text = "Tom Holland",
                                                fontSize = 10.sp
                                            )
                                        }



                                        //PONTOS VINDO DO BANCO
                                        Text(
                                            modifier = Modifier
                                                .padding(top = 20.dp)
                                                .height(12.dp)
                                                .width(37.dp),
                                            text = "189PTS",
                                            fontSize = 10.sp
                                        )
                                    }

                                }

                            }


                        }

                    }

                }
            }
            Column (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(400.dp)
                    .width(350.dp),
            ) {

                Column(
                    modifier = Modifier
                        .height(290.dp)
                        .width(360.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .width(200.dp)
                            .height(50.dp)
                    ) {
                        Text(
                            text = "Rank - mentor",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(top = 25.dp)
                                .width(160.dp)
                                .height(200.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .width(130.dp)
                                    .height(60.dp)
                                    .align(Alignment.CenterHorizontally),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        modifier = Modifier.size(25.dp),
                                        painter = painterResource(id = R.drawable.estrela),
                                        contentDescription = "estrela"
                                    )
                                    Image(
                                        modifier = Modifier.size(25.dp),
                                        painter = painterResource(id = R.drawable.estrela),
                                        contentDescription = "estrela"
                                    )
                                    Image(
                                        modifier = Modifier.size(25.dp),
                                        painter = painterResource(id = R.drawable.estrela),
                                        contentDescription = "estrela"
                                    )
                                    Image(
                                        modifier = Modifier.size(25.dp),
                                        painter = painterResource(id = R.drawable.estrela),
                                        contentDescription = "estrela")
                                    Image(
                                        modifier = Modifier.size(25.dp),
                                        painter = painterResource(id = R.drawable.estrelapelametade),
                                        contentDescription = "estrela na metade")

                                }

                                Text(
                                    text = "(130 avaliações)",
                                    fontSize = 12.sp,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )

                            }
                            Column (modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                            ) {

                                Row (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.width(25.dp)
                                            .fillMaxHeight()
                                    ) {

                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "5"
                                        )
                                    }
                                    Box(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(Color(0xffD9D9D9))
                                            .height(10.dp)
                                            .width(100.dp)
                                    ){
                                        Box(modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .fillMaxHeight()
                                            .width(80.dp)
                                            .background(Color(0xff302F2F)))

                                    }
                                    Box(
                                        modifier = Modifier.width(25.dp)
                                            .fillMaxHeight()
                                    ) {
                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "80%",
                                            fontSize = 10.sp
                                        )
                                    }
                                }

                                Row (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                                ){
                                    Box (modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()){

                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "4")
                                    }
                                    Box(modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0xffD9D9D9))
                                        .height(10.dp)
                                        .width(100.dp)
                                    ){
                                        Box(modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .fillMaxHeight()
                                            .width(60.dp)
                                            .background(Color(0xff302F2F)))
                                    }
                                    Box(modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()) {
                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "55%",
                                            fontSize = 10.sp
                                        )
                                    }
                                }


                                Row (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                                ){
                                    Box (modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()){

                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "3")
                                    }
                                    Box(modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0xffD9D9D9))
                                        .height(10.dp)
                                        .width(100.dp)
                                    ){
                                        Box(modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .fillMaxHeight()
                                            .width(40.dp)
                                            .background(Color(0xff302F2F)))
                                    }
                                    Box(modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()) {
                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "35%",
                                            fontSize = 10.sp
                                        )
                                    }
                                }


                                Row (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                                ){
                                    Box (modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()){

                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "2")
                                    }
                                    Box(modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0xffD9D9D9))
                                        .height(10.dp)
                                        .width(100.dp)
                                    ){
                                        Box(modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .fillMaxHeight()
                                            .width(10.dp)
                                            .background(Color(0xff302F2F)))
                                    }
                                    Box(modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()) {
                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "10%",
                                            fontSize = 10.sp
                                        )
                                    }
                                }


                                Row (modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                                ){
                                    Box (modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()){

                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "1")
                                    }
                                    Box(modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color(0xffD9D9D9))
                                        .height(10.dp)
                                        .width(100.dp)
                                    )
                                    Box(modifier = Modifier.width(25.dp)
                                        .fillMaxHeight()) {
                                        Text(
                                            modifier = Modifier.align(Alignment.Center),
                                            text = "0%",
                                            fontSize = 10.sp
                                        )
                                    }
                                }











                            }



                        }


                        Column(
                            modifier = Modifier
                                .width(200.dp)
                                .height(240.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .height(130.dp)
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    //NUMERO DE PESSOAS AJUDADAS VINDO DO BANCO
                                    text = "150 Pessoas ajudadas",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                                Box(
                                    modifier = Modifier
                                        .height(95.dp)
                                        .width(200.dp)
                                        .border(2.dp, Color(0xFFD9D9D9))
                                ) {
                                    Column {
                                        Row(
                                            modifier = Modifier
                                                .height(30.dp)
                                                .fillMaxWidth()
                                        ) {

                                            Column {
                                                Row(
                                                    modifier = Modifier
                                                        .height(30.dp)
                                                        .fillMaxWidth(),
                                                    verticalAlignment = Alignment.CenterVertically // Centraliza verticalmente todos os itens da Row

                                                ) {
                                                    Box(
                                                        modifier = Modifier
                                                            .height(35.dp)
                                                            .width(35.dp)
                                                    ) {

                                                        //POSICAO VINDO DO BANCO
                                                        Text(
                                                            modifier = Modifier
                                                                .align(Alignment.Center),
                                                            text = "#9",
                                                            fontWeight = FontWeight.Bold,
                                                            fontSize = 12.sp
                                                        )
                                                    }


                                                    //FOTO VINDO DO BANCO
                                                    Image(
                                                        modifier = Modifier
                                                            .size(20.dp),
                                                        painter = painterResource(id = R.drawable.fotomentor),
                                                        contentDescription = "Foto de Perfil1"
                                                    )

                                                    Spacer(modifier = Modifier.width(10.dp))

                                                    Column(
                                                        modifier = Modifier
                                                            .fillMaxHeight()
                                                            .width(80.dp)
                                                    ) {
                                                        //NOME VINDO DO BANCO
                                                        Text(
                                                            modifier = Modifier.padding(top = 10.dp),
                                                            text = "grande eweww...",
                                                            fontSize = 10.sp
                                                        )

                                                    }


                                                    //PONTOS VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .height(10.dp)
                                                            .width(37.dp),
                                                        text = "174",
                                                        fontWeight = FontWeight.Bold,
                                                        fontSize = 10.sp
                                                    )
                                                }

                                            }


                                        }
                                        Row(
                                            modifier = Modifier
                                                .height(30.dp)
                                                .fillMaxWidth()
                                                .background(Color(0xFFD9D9D9))
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .height(55.dp)
                                                    .fillMaxWidth(),
                                                verticalAlignment = Alignment.CenterVertically // Centraliza verticalmente todos os itens da Row

                                            ) {
                                                Box(
                                                    modifier = Modifier
                                                        .height(60.dp)
                                                        .width(35.dp)
                                                ) {

                                                    //POSICAO VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .align(Alignment.Center),
                                                        text = "#10",
                                                        fontWeight = FontWeight.Bold,
                                                        fontSize = 12.sp
                                                    )
                                                }


                                                //FOTO VINDO DO BANCO
                                                Image(
                                                    modifier = Modifier
                                                        .size(20.dp),
                                                    painter = painterResource(id = R.drawable.fotomentor),
                                                    contentDescription = "Foto de Perfil"
                                                )

                                                Spacer(modifier = Modifier.width(10.dp))


                                                Column(
                                                    modifier = Modifier
                                                        .fillMaxHeight()
                                                        .width(80.dp)
                                                ) {
                                                    //NOME VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .padding(top = 10.dp),
                                                        text = "Silvia Santos",
                                                        fontSize = 10.sp
                                                    )

                                                }


                                                //PONTOS VINDO DO BANCO
                                                Text(
                                                    modifier = Modifier
                                                        .height(12.dp)
                                                        .width(37.dp),
                                                    text = "150",
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 10.sp
                                                )
                                            }


                                        }
                                        Row(
                                            modifier = Modifier
                                                .height(55.dp)
                                                .width(800.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .height(55.dp)
                                                    .fillMaxWidth(),
                                                verticalAlignment = Alignment.CenterVertically // Centraliza verticalmente todos os itens da Row

                                            ) {
                                                Box(
                                                    modifier = Modifier
                                                        .height(55.dp)
                                                        .width(35.dp)
                                                ) {

                                                    //POSICAO VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .align(Alignment.Center),
                                                        text = "#11",
                                                        fontWeight = FontWeight.Bold,
                                                        fontSize = 12.sp
                                                    )
                                                }


                                                //FOTO VINDO DO BANCO
                                                Image(
                                                    modifier = Modifier
                                                        .size(20.dp),
                                                    painter = painterResource(id = R.drawable.fotomentor),
                                                    contentDescription = "Foto de Perfil"
                                                )

                                                Spacer(modifier = Modifier.width(10.dp))


                                                Column(
                                                    modifier = Modifier
                                                        .fillMaxHeight()
                                                        .width(80.dp)
                                                ) {
                                                    //NOME VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier.padding(top = 10.dp),
                                                        text = "Tom Holland",
                                                        fontSize = 10.sp
                                                    )
                                                }


                                                //PONTOS VINDO DO BANCO
                                                Text(
                                                    modifier = Modifier
                                                        .height(12.dp)
                                                        .width(37.dp),
                                                    text = "132",
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 10.sp
                                                )
                                            }

                                        }

                                    }

                                }



                            }

                            Column(
                                modifier = Modifier
                                    .height(130.dp)
                                    .fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    //NUMERO DE ESTRELAS  VINDO DO BANCO
                                    text = "4.5 estrelas",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.align(Alignment.CenterHorizontally)
                                )
                                Box(
                                    modifier = Modifier
                                        .height(95.dp)
                                        .width(200.dp)
                                        .border(2.dp, Color(0xFFD9D9D9))
                                ) {
                                    Column {
                                        Row(
                                            modifier = Modifier
                                                .height(30.dp)
                                                .fillMaxWidth()
                                        ) {

                                            Column {
                                                Row(
                                                    modifier = Modifier
                                                        .height(30.dp)
                                                        .fillMaxWidth(),
                                                    verticalAlignment = Alignment.CenterVertically // Centraliza verticalmente todos os itens da Row

                                                ) {
                                                    Box(
                                                        modifier = Modifier
                                                            .height(35.dp)
                                                            .width(35.dp)
                                                    ) {

                                                        //POSICAO VINDO DO BANCO
                                                        Text(
                                                            modifier = Modifier
                                                                .align(Alignment.Center),
                                                            text = "#9",
                                                            fontWeight = FontWeight.Bold,
                                                            fontSize = 12.sp
                                                        )
                                                    }


                                                    //FOTO VINDO DO BANCO
                                                    Image(
                                                        modifier = Modifier
                                                            .size(20.dp),
                                                        painter = painterResource(id = R.drawable.fotomentor),
                                                        contentDescription = "Foto de Perfil1"
                                                    )

                                                    Spacer(modifier = Modifier.width(10.dp))

                                                    Column(
                                                        modifier = Modifier
                                                            .fillMaxHeight()
                                                            .width(80.dp)
                                                    ) {
                                                        //NOME VINDO DO BANCO
                                                        Text(
                                                            modifier = Modifier.padding(top = 10.dp),
                                                            text = "grande eweww...",
                                                            fontSize = 10.sp
                                                        )

                                                    }

                                                    Column (modifier = Modifier.width(35.dp)) {
                                                        //PONTOS VINDO DO BANCO
                                                        Text(
                                                            modifier = Modifier
                                                                .height(10.dp)
                                                                .width(20.dp),
                                                            text = "4.6",
                                                            fontSize = 10.sp
                                                        )

                                                        Divider(
                                                            color = Color.Black, // Escolha a cor da linha
                                                            thickness = 1.dp,   // Espessura da linha
                                                            modifier = Modifier
                                                                .width(15.dp) // Preencher largura da coluna
                                                        )

                                                        Text(
                                                            modifier = Modifier
                                                                .height(10.dp)
                                                                .width(20.dp),
                                                            text = "89",
                                                            fontSize = 10.sp
                                                        )
                                                    }


                                                }

                                            }


                                        }
                                        Row(
                                            modifier = Modifier
                                                .height(30.dp)
                                                .fillMaxWidth()
                                                .background(Color(0xFFD9D9D9))
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .height(55.dp)
                                                    .fillMaxWidth(),
                                                verticalAlignment = Alignment.CenterVertically // Centraliza verticalmente todos os itens da Row

                                            ) {
                                                Box(
                                                    modifier = Modifier
                                                        .height(60.dp)
                                                        .width(35.dp)
                                                ) {

                                                    //POSICAO VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .align(Alignment.Center),
                                                        text = "#10",
                                                        fontWeight = FontWeight.Bold,
                                                        fontSize = 12.sp
                                                    )
                                                }


                                                //FOTO VINDO DO BANCO
                                                Image(
                                                    modifier = Modifier
                                                        .size(20.dp),
                                                    painter = painterResource(id = R.drawable.fotomentor),
                                                    contentDescription = "Foto de Perfil"
                                                )

                                                Spacer(modifier = Modifier.width(10.dp))


                                                Column(
                                                    modifier = Modifier
                                                        .fillMaxHeight()
                                                        .width(80.dp)
                                                ) {
                                                    //NOME VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .padding(top = 10.dp),
                                                        text = "Silvia Santos",
                                                        fontSize = 10.sp
                                                    )

                                                }

                                                Column (modifier = Modifier.width(35.dp)) {
                                                    //PONTOS VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .height(10.dp)
                                                            .width(20.dp),
                                                        text = "4.5",
                                                        fontSize = 10.sp
                                                    )

                                                    Divider(
                                                        color = Color.Black, // Escolha a cor da linha
                                                        thickness = 1.dp,   // Espessura da linha
                                                        modifier = Modifier
                                                            .width(15.dp) // Preencher largura da coluna
                                                    )

                                                    Text(
                                                        modifier = Modifier
                                                            .height(10.dp)
                                                            .width(40.dp),
                                                        text = "130",
                                                        fontSize = 10.sp
                                                    )
                                                }
                                            }


                                        }
                                        Row(
                                            modifier = Modifier
                                                .height(55.dp)
                                                .width(800.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .height(55.dp)
                                                    .fillMaxWidth(),
                                                verticalAlignment = Alignment.CenterVertically // Centraliza verticalmente todos os itens da Row

                                            ) {
                                                Box(
                                                    modifier = Modifier
                                                        .height(55.dp)
                                                        .width(35.dp)
                                                ) {

                                                    //POSICAO VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .align(Alignment.Center),
                                                        text = "#11",
                                                        fontWeight = FontWeight.Bold,
                                                        fontSize = 12.sp
                                                    )
                                                }


                                                //FOTO VINDO DO BANCO
                                                Image(
                                                    modifier = Modifier
                                                        .size(20.dp),
                                                    painter = painterResource(id = R.drawable.fotomentor),
                                                    contentDescription = "Foto de Perfil"
                                                )

                                                Spacer(modifier = Modifier.width(10.dp))


                                                Column(
                                                    modifier = Modifier
                                                        .fillMaxHeight()
                                                        .width(80.dp)
                                                ) {
                                                    //NOME VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier.padding(top = 10.dp),
                                                        text = "Tom Holland",
                                                        fontSize = 10.sp
                                                    )
                                                }


                                                Column (modifier = Modifier.width(35.dp)) {
                                                    //PONTOS VINDO DO BANCO
                                                    Text(
                                                        modifier = Modifier
                                                            .height(10.dp)
                                                            .width(20.dp),
                                                        text = "4.5",
                                                        fontSize = 10.sp
                                                    )

                                                    Divider(
                                                        color = Color.Black,
                                                        thickness = 1.dp,
                                                        modifier = Modifier
                                                            .width(15.dp)
                                                    )

                                                    Text(
                                                        modifier = Modifier
                                                            .height(10.dp)
                                                            .width(40.dp),
                                                        text = "114",
                                                        fontSize = 10.sp
                                                    )
                                                }
                                            }

                                        }

                                    }

                                }



                            }

                        }







                    }




                }


            }


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaPerfilPreview() {
        TelaPerfil()
    }
